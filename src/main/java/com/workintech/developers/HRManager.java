package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[20];
    private MidDeveloper[] midDevelopers = new MidDeveloper[20];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[20];

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
    }

    // JuniorDeveloper ekleme
    public void addEmployee(JuniorDeveloper jd) {
        boolean added = false;
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = jd;
                added = true;
                System.out.println(jd.getName() + " added to junior developers.");
                break;
            }
        }
        if (!added) {
            System.out.println("Junior developers array is full! Cannot add " + jd.getName());
        }
    }

    // MidDeveloper ekleme
    public void addEmployee(MidDeveloper md) {
        boolean added = false;
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = md;
                added = true;
                System.out.println(md.getName() + " added to mid developers.");
                break;
            }
        }
        if (!added) {
            System.out.println("Mid developers array is full! Cannot add " + md.getName());
        }
    }

    // SeniorDeveloper ekleme
    public void addEmployee(SeniorDeveloper sd) {
        boolean added = false;
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = sd;
                added = true;
                System.out.println(sd.getName() + " added to senior developers.");
                break;
            }
        }
        if (!added) {
            System.out.println("Senior developers array is full! Cannot add " + sd.getName());
        }
    }
}
