package org.sid.entities;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DataJpaTest
@ExtendWith(SpringExtension.class)
public class ReservationJpaTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void mapping() {
        Reservation reservation = testEntityManager.persistFlushFind(new Reservation(null, "bahalla"));
        Assertions.assertThat(reservation.getId()).isNotNull();
        Assertions.assertThat(reservation.getId()).isGreaterThan(0);
        Assertions.assertThat(reservation.getReservationName()).isEqualTo("bahalla");
    }

}
