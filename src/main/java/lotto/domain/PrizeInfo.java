package lotto.domain;

import lotto.domain.enums.Rank;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class PrizeInfo {
    private final Map<Rank, Prize> prizeMap = new HashMap<>();
    private BiFunction<Pick, Collection<Integer>, Rank> rankChecker;

    public Map<Rank, Prize> getPrizeMap() {
        return prizeMap;
    }

    public void setPrizeChecker(BiFunction<Pick, Collection<Integer>, Rank> rankChecker) {
        this.rankChecker = rankChecker;
    }

    public Rank checkRank(Pick pick, Collection<Integer> winningBalls) {
        return this.rankChecker.apply(pick, winningBalls);
    }

    public void add(Rank rank, Long cash) {
        prizeMap.putIfAbsent(rank, new Prize(rank, cash));
    }

    public Prize getPrize(Rank rank) {
        return prizeMap.get(rank);
    }


}
