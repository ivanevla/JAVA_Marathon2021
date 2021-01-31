package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand oldMembers, MusicBand newMembers) {
        oldMembers.getMembers().forEach(newMembers::addMember);
        oldMembers.getMembers().clear();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void addMember(String fullName) {
        this.members.add(fullName);
    }

    public void removeMember(String fullName) {
        this.members.remove(fullName);
    }

    public void printMembers() {
        System.out.println("MusicBand " + this.name + " members");
        this.getMembers().forEach(System.out::println);
    }
}
