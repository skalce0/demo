package IF.Match;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class MatchFootball {

    public static void getLastRateBySourceAndDest() {

        String url = "https://jsonmock.hackerrank.com/api/football_matches?year=2011&team1=Barcelona&page=1";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Page1> response = restTemplate.getForEntity(url, Page1.class);
        Page1 res = response.getBody();
        System.out.println(res);
        List<MatchInfo1> matches =res.data;
        System.out.println("where");
        System.out.println(matches);
    }

    public static Integer team1goals(String year, String team, Integer page){

        String url = "https://jsonmock.hackerrank.com/api/football_matches?"+"year="+year+"&team2="+team+"&page="+page;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Page1> response = restTemplate.getForEntity(url,Page1.class);
        Page1 res = response.getBody();
        List<MatchInfo1> matches =res.data;
        Integer team1goal = 0;
        for (MatchInfo1 m : matches){
            team1goal += m.team1goals;
        }

        return team1goal;

    }

    public static Integer team2goals(String year, String team, Integer page){
        String url = "https://jsonmock.hackerrank.com/api/football_matches?"+"year="+year+"&team2="+team+"&page="+page;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Page1> response = restTemplate.getForEntity(url,Page1.class);
        Page1 res = response.getBody();
        List<MatchInfo1> matches =res.data;
        System.out.println(matches);
        Integer team2goal = 0;

        for (MatchInfo1 m : matches){
            team2goal += m.team2goals;
            System.out.println("got good");
        }


        return team2goal;
    }
/*

public static List<MatchInfo1> getAllMatchesOfHomeTeam (String team){
        String url = "https://jsonmock.hackerrank.com/api/football_matches?"+"&team1="+team;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Page1> response = restTemplate.getForEntity(url,Page1.class);
        Page1 res = response.getBody();
        List<MatchInfo1> matches = res.data;
        return matches;
    }
 */
    public static void main(String[] args){
        MatchFootball matchFootball = new MatchFootball();
        matchFootball.getLastRateBySourceAndDest();
        System.out.println("got good ag");
        System.out.println(matchFootball.team2goals("2011", "AC Milan",1));

    }
}
