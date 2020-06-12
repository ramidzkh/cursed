package cursed.item;

import cursed.Cursed;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.Registry;

public interface Items {

    ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            Cursed.identifier("cursed"),
            () -> new ItemStack(Items.WITHERED_FRAGMENT));

    Item WITHERED_FRAGMENT = register("withered_fragment", new WitheredFragmentItem(new Item.Settings().group(ITEM_GROUP)));

    static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, Cursed.identifier(name), item);
    }

    static void initialize() {
    }
}
