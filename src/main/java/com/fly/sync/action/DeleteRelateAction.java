package com.fly.sync.action;

import com.fly.sync.contract.AbstractRecordAction;
import com.fly.sync.contract.AbstractRelateAction;
import com.fly.sync.contract.DbFactory;
import com.fly.sync.mysql.model.Record;
import com.fly.sync.setting.River;
import org.elasticsearch.action.DocWriteRequest;

import java.util.List;

public class DeleteRelateAction implements AbstractRecordAction, AbstractRelateAction {

    private Record record;
    private List<River.Associate> beRelatedList;

    public DeleteRelateAction(Record record, List<River.Associate> beRelatedList) {
        this.record = record;
        this.beRelatedList = beRelatedList;
    }

    public static DeleteRelateAction create(Record record, List<River.Associate> beRelatedList) {
        return new DeleteRelateAction(record, beRelatedList);
    }

    @Override
    public Record getRecord() {
        return record;
    }

    @Override
    public DocWriteRequest getRequest(DbFactory dbFactory) throws Exception {
        return null;
    }

    @Override
    public void execute(DbFactory dbFactory) {

    }

    @Override
    public String getGroup() {
        return AbstractRelateAction.class.getName();
    }
}
