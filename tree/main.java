import java.io.File;
import java.util.ArrayList;
import java.util.List;

interface FileComponent {
    void display(String indent);
}

class FileLeaf implements FileComponent {
    private String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name);
    }
}

class DirectoryComposite implements FileComponent {
    private String name;
    private List<FileComponent> children;

    public DirectoryComposite(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    public void remove(FileComponent component) {
        children.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name + "/");
        for (FileComponent component : children) {
            component.display(indent + "    ");
        }
    }
}

public class Main {
    public static void buildTree(File file, DirectoryComposite parent) {
        if (file.isDirectory()) {
            DirectoryComposite directory = new DirectoryComposite(file.getName());
            if (parent != null) {
                parent.add(directory);
            }
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    buildTree(f, directory);
                }
            }
        } else {
            FileLeaf fileLeaf = new FileLeaf(file.getName());
            parent.add(fileLeaf);
        }
    }

    public static void main(String[] args) {
        DirectoryComposite root = new DirectoryComposite(".");
        buildTree(new File("."), root);
        root.display("");
    }
}
