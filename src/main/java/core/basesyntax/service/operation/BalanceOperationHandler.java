package core.basesyntax.service.operation;

import core.basesyntax.service.FruitTransaction;
import java.util.Map;

public class BalanceOperationHandler implements OperationHandler {
    @Override
    public void handle(FruitTransaction transaction, Map<String, Integer> storage) {
        String fruit = transaction.getFruit();
        int amount = transaction.getAmount();

        storage.put(fruit, storage.getOrDefault(fruit, amount));
    }
}
