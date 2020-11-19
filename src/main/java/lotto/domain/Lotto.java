package lotto.domain;

import lotto.domain.enums.Rank;

import java.util.Collection;

public class Lotto {
    private Integer price;
    private LottoConstraint constraint;
    private PrizeInfo prizeInfo;

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }


    public void setConstraint(LottoConstraint constraint) {
        this.constraint = constraint;
    }

    public LottoConstraint getConstraint() {
        return constraint;
    }

    public void setPrize(PrizeInfo prizeInfo) {
        this.prizeInfo = prizeInfo;
    }

    public Prize getPrize(Rank rank) {
        return this.prizeInfo.getPrize(rank);
    }

    public Rank checkRank(Pick pick, Collection<Integer> winningBalls) {
        return this.prizeInfo.checkRank(pick, winningBalls);
    }
}
