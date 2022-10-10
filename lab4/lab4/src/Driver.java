public class Driver implements AutoSpecialist{
    private String name;
    private String surname;
    private int age;
    int driving_age; // driving experience
    boolean know_ro_lang;
    boolean know_ru_lang;
    boolean know_en_lang;
    int work_exp; // working experience in taxi industry

    public Driver(String name, String surname, int age,
                  int driving_age, boolean know_ro_lang, boolean know_ru_lang,
                  boolean know_en_lang, int work_exp) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.driving_age = driving_age;
        this.know_ro_lang = know_ro_lang;
        this.know_ru_lang = know_ru_lang;
        this.know_en_lang = know_en_lang;
        this.work_exp = work_exp;
    }
    public void isDriving(String car, String model_name, String type, String price) {
        System.out.println(getName() + " " + getSurname() + " drives a " + model_name + ", " + type + ", " + price + ".\n");

    }

    public void drives() {
        System.out.println(getName() + " drives the car.");
    }

    public void arrivesToDestination() {
        System.out.println(getName() + " has brought passenger to the destination.");
    }

    @Override
    public void isOnBreak() {
        System.out.println(getName() + " is on break.");
    }
    public int skill_nr(boolean print) {
        int d_a = 0;
        int r_l = 0;
        int ru_l = 0;
        int e_l = 0;
        int w_e = 0;
        int skills = 0;
        if (driving_age > 3) {
            d_a = 2;
        }
        if (know_ro_lang) {
            r_l = 2;
        }
        if (know_ru_lang) {
            ru_l = 2;
        }
        if (know_en_lang) {
            e_l = 2;
        }
        if (work_exp != 0) {
            w_e = 2;
        }

        skills = d_a + r_l + ru_l + e_l + w_e;

        if (print) {
            System.out.printf("%s has got %d points in the skills set test.%n\n", getName(), skills);
        }
        return skills;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDriving_age() {
        return driving_age;
    }

    public void setDriving_age(int driving_age) {
        this.driving_age = driving_age;
    }

    public boolean isKnow_ro_lang() {
        return know_ro_lang;
    }

    public void setKnow_ro_lang(boolean know_ro_lang) {
        this.know_ro_lang = know_ro_lang;
    }

    public boolean isKnow_ru_lang() {
        return know_ru_lang;
    }

    public void setKnow_ru_lang(boolean know_ru_lang) {
        this.know_ru_lang = know_ru_lang;
    }

    public boolean isKnow_en_lang() {
        return know_en_lang;
    }

    public void setKnow_en_lang(boolean know_en_lang) {
        this.know_en_lang = know_en_lang;
    }

    public int getWork_exp() {
        return work_exp;
    }

    public void setWork_exp(int work_exp) {
        this.work_exp = work_exp;
    }
}

