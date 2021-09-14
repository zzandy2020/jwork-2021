import java.rmi.server.Operation;

import jdk.internal.module.SystemModuleFinders;

//package W01.191220107;

public class Stone extends Obstruction {
    Stone(String _name){
        name=_name;
        operation="moved"
    }
}
