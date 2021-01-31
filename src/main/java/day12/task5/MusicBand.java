package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
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

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void addMember(MusicArtist member) {
        this.members.add(member);
    }

    public void removeMember(MusicArtist member) {
        this.members.remove(member);
    }

    public void printMembers() {
        System.out.println("MusicBand " + this.name + " members");
        this.getMembers().forEach(member -> System.out.println(member.getName()));
    }
}
