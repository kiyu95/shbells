package com.kimbaekjung.semiproject.admin.service;

import com.kimbaekjung.semiproject.admin.dao.AdminProposeDAO;
import com.kimbaekjung.semiproject.admin.dto.ProposeAnswerDTO;
import com.kimbaekjung.semiproject.admin.dto.ProposeSelectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProposeService {

    @Autowired
    private AdminProposeDAO adminProposeDAO;

    public List<ProposeSelectDTO> selectAllPropose() {
        List<ProposeSelectDTO> proposeList = adminProposeDAO.selectAllPropose();

        if (Objects.isNull(proposeList)) {
            System.out.println("등록된 문의사항이 없습니다.");
        }

        return proposeList;
    }


    public ProposeAnswerDTO proposeAnswer(int proposeCode, String proposeName) {
        ProposeAnswerDTO answer = adminProposeDAO.proposeAnswer(proposeCode, proposeName);

        return answer;
    }

    public int answerRegist(String proposeAnswer, int proposeCode) {
        int result = adminProposeDAO.answerRegist(proposeAnswer, proposeCode);

        return result;
    }

    public int deletePropose(String[] selectedProposeCodeList) {
        int result = adminProposeDAO.deletePropose(selectedProposeCodeList);

        return result;
    }

    public List<ProposeSelectDTO> selectAllPropose(String criteria, String keyword) {
        List<ProposeSelectDTO> proposeList = adminProposeDAO.selectAllPropose(criteria, keyword);

        return proposeList;
    }
}
