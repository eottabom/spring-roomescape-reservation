package roomescape.domain;

public class ReservationTime {

	private Long id;

	private String startAt;

	public static Builder builder() {
		return new Builder();
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStartAt() {
		return this.startAt;
	}

	public void setStartAt(String startAt) {
		this.startAt = startAt;
	}

	public static final class Builder {

		private final ReservationTime reservationTime;

		public Builder() {
			this.reservationTime = new ReservationTime();
		}

		public Builder id(long id) {
			this.reservationTime.id = id;
			return this;
		}

		public Builder startAt(String startAt) {
			this.reservationTime.startAt = startAt;
			return this;
		}

		public ReservationTime build() {
			return this.reservationTime;
		}

	}

}
