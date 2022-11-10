package IF.Match;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchInfo1 {
    String competition;
    String year;
    String round;
    String team1;
    String team2;
    Integer team1goals;
    Integer team2goals;

}
