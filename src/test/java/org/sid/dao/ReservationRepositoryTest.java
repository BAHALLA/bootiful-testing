package org.sid.dao;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.sid.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@DataJpaTest
@ExtendWith(SpringExtension.class)
public class ReservationRepositoryTest {

    @Autowired
    private ReservationRepository reservationRepository;
    @Test
    public void findByReservationName() {
        reservationRepository.save(new Reservation(null , "bahalla"));
        List<Reservation> reservations = reservationRepository.findByReservationName("bahalla");
        Assertions.assertThat(reservations.size()).isEqualTo(1);
        Assertions.assertThat(reservations.iterator().next().getId()).isGreaterThan(0);
        Assertions.assertThat(reservations.iterator().next().getReservationName()).isEqualTo("bahalla");
    }
}
