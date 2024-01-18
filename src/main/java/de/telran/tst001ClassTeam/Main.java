package de.telran.tst001ClassTeam;

import com.github.javafaker.Faker;

import java.util.*;

public class Main {
    private static List<Pupil> teamsPupil = new ArrayList<>();
    private static List<TeenAger> teamsTeenAger = new ArrayList<>();
    private static List<Adult> teamsAdult = new ArrayList<>();
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        List<TeamX> teamsList = new ArrayList<>();

        Pupil p1 = new Pupil(FAKER.name().name(), RANDOM.nextInt(11));
        Pupil p2 = new Pupil(FAKER.name().name(), RANDOM.nextInt(11));

        TeenAger t1 = new TeenAger(FAKER.name().name(), RANDOM.nextInt(20));
        TeenAger t2 = new TeenAger(FAKER.name().name(), RANDOM.nextInt(20));

        Adult a1 = new Adult(FAKER.name().name(), RANDOM.nextInt(100));
        Adult a2 = new Adult(FAKER.name().name(), RANDOM.nextInt(100));

        TeamX team1 = new TeamX(FAKER.team().name());
        TeamX team2 = new TeamX(FAKER.team().name());

        team1.addNewParticipant(p1);
        team1.addNewParticipant(p2);

        team2.addNewParticipant(t1);
        team2.addNewParticipant(t2);
        //pt1.play(pt2);

        //Add Team to List
//        teamsList.add(team1);
//        teamsList.add(team2);
//        //Print List of Teams
//        System.out.println("Команда №1:" + teamsList.get(0).getTeamName());
//        //System.out.println(teamsList.get(0).getTeamName());
//        //System.out.println(teamsList.get(0).getParticipantList().get(0));
//        for (Object s: teamsList.get(0).getParticipantList()) {
//            System.out.println(s);
//        }
//
//        System.out.println("Команда №2:" + teamsList.get(1).getTeamName());
//        for (Object s: teamsList.get(1).getParticipantList()) {
//            System.out.println(s);
//        }

            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            map.put(1, 10);
            map.put(2, 30);
            map.put(3, 50);
            map.put(4, 40);
            map.put(5, 100);
            map.put(6, 60);
            map.put(7, 110);
            map.put(8, 50);
            map.put(9, 90);
            map.put(10, 70);
            map.put(11, 80);

// Sort Map by Znach:
            map.entrySet().stream()
                    .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                    .forEach(System.out::println); // или любой другой конечный метод

//        Map<Integer, Integer> map = new HashMap<>();
//        List list = new ArrayList(map.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
//                return a.getValue() - b.getValue();
//            }
//        });

//        public static <K, V extends Comparable<? super V>> Map<K, V>
//        sortByValue( Map<K, V> map )
//        {
//            Map<K,V> result = new LinkedHashMap<>();
//            Stream <Entry<K,V>> st = map.entrySet().stream();
//
//            st.sorted(Comparator.comparing(e -> e.getValue()))
//                    .forEach(e ->result.put(e.getKey(),e.getValue()));
//
//            return result;
//        }

//        TreeMap< String ,Integer> map= new TreeMap< String,Integer>();
//        SortedMap<Integer, String> sortMapa = new TreeMap<Integer, String>(new IntegerComparator<Integer>());
//        Iterator<?> it = map.entrySet().iterator();
//
//        while(it.hasNext())
//        {   @SuppressWarnings("unchecked")
//        Entry< String ,Integer> En = (Entry<String, Integer>) it.next();
//            sortMapa.put( En.getValue(), En.getKey());
//
//        }
//
//        Iterator<?> sortit = sortMapa.entrySet().iterator();
//        while(sortit.hasNext())
//        {   @SuppressWarnings("unchecked")
//        Entry< Integer,String > sEn = (Entry<Integer,String>) sortit.next();
//            System.out.println(sEn.getValue()+"-->"+sEn.getKey());
//
//        }


        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3, "Three");
        map1.put(4, "Four");

        // Используем стрим для перебора значений в Map
        map1.values().stream()
                .map(String::toUpperCase)
                .map(x->x+"-")
                .limit(3)
                //.collect(Collectors.joining("-"));
                .forEach(System.out::println);



    }

}
