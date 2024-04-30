package io.ssafy.gatee.domain.family_schedule.dao;

import com.querydsl.jpa.JPQLQueryFactory;
import io.ssafy.gatee.domain.family.entity.Family;
import io.ssafy.gatee.domain.family_schedule.entity.QFamilySchedule;
import io.ssafy.gatee.domain.schedule.dto.response.ScheduleListInfoRes;
import io.ssafy.gatee.domain.schedule.entity.Category;
import io.ssafy.gatee.domain.schedule.entity.Schedule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FamilyScheduleRepositoryImpl implements FamilyScheduleRepositoryCustom {

    private final JPQLQueryFactory jpqlQueryFactory;

    @Override
    public List<ScheduleListInfoRes> getPersonalScheduleList(Family family) {
        QFamilySchedule familySchedule = QFamilySchedule.familySchedule;

        return jpqlQueryFactory.select(familySchedule.schedule)
                .from(familySchedule)
                .where(familySchedule.family.eq(family))
                .where(familySchedule.schedule.category.eq(Category.PERSONAL))
                .fetch().stream().map(ScheduleListInfoRes::toDto).toList();
    }

    @Override
    public List<ScheduleListInfoRes> getGroupScheduleList(Family family) {
        QFamilySchedule familySchedule = QFamilySchedule.familySchedule;

        return jpqlQueryFactory.select(familySchedule.schedule)
                .from(familySchedule)
                .where(familySchedule.family.eq(family))
                .where(familySchedule.schedule.category.eq(Category.GROUP))
                .fetch().stream().map(ScheduleListInfoRes::toDto).toList();
    }
}
