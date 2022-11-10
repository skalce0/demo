package IF.Match;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class Page1 {
    Integer page;
    Integer per_page;
    Integer total;
    Integer total_pages;
    List<MatchInfo1> data;
}
