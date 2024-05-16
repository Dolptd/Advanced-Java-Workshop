import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindLongTracks {
    public static void main(String[] args) {
        List<Album> arrAlbums = SampleData.albums.collect(Collectors.toList());
        System.out.println(findLongTracks(arrAlbums));
    }

    // List<Album> arrAlbums = new ArrayList<>();

    // // Provided Code
    // public static Set<String> findLongTracks(List<Album> albums) {
    // Set<String> trackNames = new HashSet<>();
    // for (Album album : albums) {
    // for (Track track : album.getTrackList()) {
    // if (track.getLength() > 60) {
    // String name = track.getName();
    // trackNames.add(name);
    // }
    // }
    // }
    // return trackNames;
    // }

    public static Set<String> findLongTracks(List<Album> albums) {
        return albums.stream()
                .flatMap(album -> album.getTrackList().stream())
                .filter(track -> track.getLength() > 60)
                .map(Track::getName)
                .collect(Collectors.toSet());
    }

    // arrAlbums.add(
    // // Create a new Album object
    // new Album("All My Purple Feeling",
    // List.of(new Track("Welcome to My Purple Story", 65),
    // new Track("เมื่อไหร่ที่คิดถึงเธอ (Echo)", 255),
    // new Track("เกาะลอยฟ้า (still)", 269),
    // new Track("ยอม (White Flag)", 221),
    // new Track("ฤดูฝัน (Drizzle)", 109),
    // new Track("เพลงรักเพลงแรก (Blooming)", 243),
    // new Track("B-D-BUB-BA", 228),
    // new Track("TAXI", 176),
    // new Track("I miss you when I'm drunk", 238),
    // new Track("ในวันพรุ่งนี้ขอให้เป็นวันที่ดี (Nomad's Lullaby)", 186),
    // new Track("I'm saying goodbye", 240)),
    // List.of(new Artist("LANDOKMAI", "TH"))));

    // // Call the findLongTracks method and print the result
    // System.out.println(findLongTracks(arrAlbums));

}
