package CreationalPatterns;

public class Main {
    public static void main(String[] args) {
        Resume original = new Resume("John Doe", "john@example.com", "Original Inc");
        original.show();

        // Clone and modify for different companies
        Resume googleResume = original.clone();
        googleResume.setCompany("Google");
        googleResume.show();

        Resume amazonResume = original.clone();
        amazonResume.setCompany("Amazon");
        amazonResume.show();
    }
}


class Resume implements Prototype {
    private String name;
    private String email;
    private String company;

    public Resume(String name, String email, String company) {
        this.name = name;
        this.email = email;
        this.company = company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Company: " + company);
        System.out.println();
    }

    // Clone method
    @Override
    public Resume clone() {
        return new Resume(this.name, this.email, this.company);
    }
}


interface Prototype {
    Prototype clone();  // Clone method
}



