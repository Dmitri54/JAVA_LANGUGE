package OOP_JAVA.lessons.les_04.Ex004.V2;

public class Program {
    public static void main(String[] args) {
        Repository<AudioContent> audioStorage = new Repository<>("audioStorage");
// Теперь я могу создать репозиторий audioStorage и закрыть его Обобщением <AudioContent>.
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 Дорожка 03.wma"));
        
        for (int index = 0; index < audioStorage.count(); index++) {
            System.out.println(audioStorage.get(index));
        }
        
        Repository<VideoContent> videoStorage = new Repository<>("videoStorage");
        videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
        videoStorage.add(new VideoContent("Новый фильм 5.3gp")); 

        for (int index = 0; index < videoStorage.count(); index++) {
            System.out.println(videoStorage.get(index));
        }
        
        //#region проблема решена

        // audioStorage.add(new VideoContent("jfvjdhdf7768.mp4")); // Теперь добавить нельзя.
        // videoStorage.add(new AudioContent("Дорожка 005.wav")); // Подчеркивает красным.

        //#endregion

        //#region 
        // Это другие проблемы:
        
        Repository<String> stringRepository = new Repository<>("stringRepository");
// Тут я создал репозиторий и закрыл его обобщение String - это не верное! 
        stringRepository.add("Кринж");
        stringRepository.add("Краш");
        stringRepository.add("Рофл");
        stringRepository.add("Криповый");
        stringRepository.add("Личинус");
        stringRepository.add("Шеймить");
        for (int i = 0; i < stringRepository.count(); i++) {
            System.out.println(stringRepository.get(i));
        }
        //#endregion
    }
}
