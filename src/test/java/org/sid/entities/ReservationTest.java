package org.sid.entities;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class ReservationTest {
        @Test
        public void creation() {

            Reservation reservation = new Reservation(1L, "BAHALLA");
            Assertions.assertThat(reservation.getId()).isEqualTo(1);
            Assertions.assertThat(reservation.getReservationName()).isNotBlank();
            Assertions.assertThat(reservation.getReservationName()).isEqualTo("BAHALLA");
        }

}