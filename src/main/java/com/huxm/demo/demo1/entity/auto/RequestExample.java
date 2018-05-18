package com.huxm.demo.demo1.entity.auto;

import java.util.ArrayList;
import java.util.List;

public class RequestExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    public RequestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateorIsNull() {
            addCriterion("CREATEOR is null");
            return (Criteria) this;
        }

        public Criteria andCreateorIsNotNull() {
            addCriterion("CREATEOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreateorEqualTo(Integer value) {
            addCriterion("CREATEOR =", value, "createor");
            return (Criteria) this;
        }

        public Criteria andCreateorNotEqualTo(Integer value) {
            addCriterion("CREATEOR <>", value, "createor");
            return (Criteria) this;
        }

        public Criteria andCreateorGreaterThan(Integer value) {
            addCriterion("CREATEOR >", value, "createor");
            return (Criteria) this;
        }

        public Criteria andCreateorGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATEOR >=", value, "createor");
            return (Criteria) this;
        }

        public Criteria andCreateorLessThan(Integer value) {
            addCriterion("CREATEOR <", value, "createor");
            return (Criteria) this;
        }

        public Criteria andCreateorLessThanOrEqualTo(Integer value) {
            addCriterion("CREATEOR <=", value, "createor");
            return (Criteria) this;
        }

        public Criteria andCreateorIn(List<Integer> values) {
            addCriterion("CREATEOR in", values, "createor");
            return (Criteria) this;
        }

        public Criteria andCreateorNotIn(List<Integer> values) {
            addCriterion("CREATEOR not in", values, "createor");
            return (Criteria) this;
        }

        public Criteria andCreateorBetween(Integer value1, Integer value2) {
            addCriterion("CREATEOR between", value1, value2, "createor");
            return (Criteria) this;
        }

        public Criteria andCreateorNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATEOR not between", value1, value2, "createor");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNull() {
            addCriterion("REVIEWER is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNotNull() {
            addCriterion("REVIEWER is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerEqualTo(Integer value) {
            addCriterion("REVIEWER =", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotEqualTo(Integer value) {
            addCriterion("REVIEWER <>", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThan(Integer value) {
            addCriterion("REVIEWER >", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThanOrEqualTo(Integer value) {
            addCriterion("REVIEWER >=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThan(Integer value) {
            addCriterion("REVIEWER <", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThanOrEqualTo(Integer value) {
            addCriterion("REVIEWER <=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerIn(List<Integer> values) {
            addCriterion("REVIEWER in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotIn(List<Integer> values) {
            addCriterion("REVIEWER not in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerBetween(Integer value1, Integer value2) {
            addCriterion("REVIEWER between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotBetween(Integer value1, Integer value2) {
            addCriterion("REVIEWER not between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table S1.REQUEST
     *
     * @mbg.generated do_not_delete_during_merge Thu May 17 15:56:52 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table S1.REQUEST
     *
     * @mbg.generated Thu May 17 15:56:52 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}