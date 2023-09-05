package io.ukids.generalmeetingmanagementsystem.domain.vote;

import io.ukids.generalmeetingmanagementsystem.domain.vote.enums.VoteValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteRepository extends JpaRepository<Vote,Long> {

    Boolean existsByAgenda_IdAndMember_StudentNumber(Long agndaId, String studentNumber);
    List<Vote> findAllByAgenda_Id(Long agendaId);
    Long countAllByVoteValue(VoteValue voteValue);
    void deleteAllByAgendaId(Long agendaId);
    void deleteAllByMember_StudentNumber(String studentNumber);
}
