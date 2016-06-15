package by.eftech.webapp.repository;


import java.util.List;

public interface MachineConditionRepository {

    MachineCondition save(MachineCondition item);

    boolean delete(int id);

    MachineCondition get(int id);

    List<MachineCondition> getAll();
}
