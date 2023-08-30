package io.ukids.generalmeetingmanagementsystem.admin.dto.response;

import io.ukids.generalmeetingmanagementsystem.domain.agenda.Agenda;
import io.ukids.generalmeetingmanagementsystem.domain.agenda.enums.AgendaStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class MeetingDetailDto {

    private String meetingName;
    private Boolean activate;
    private LocalDateTime meetingDate;
    private String sponsor;
    private List<AgendaInfoDto> agendas;

    @Data
    public static class AgendaInfoDto {
        private Long agendaId;
        private String title;
        private AgendaStatus agendaStatus;

        public AgendaInfoDto(Agenda agenda) {
            this.agendaId = agenda.getId();
            this.title = agenda.getTitle();
            this.agendaStatus = agenda.getStatus();
        }
    }
}
