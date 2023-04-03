
package net.mcreator.bluecen.world.features.ores;

public class EndlessStoneWithRiftFeature extends OreFeature {

	public static EndlessStoneWithRiftFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new EndlessStoneWithRiftFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("bluecen:endless_stone_with_rift", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(BluecenModItems.DELETED_MOD_ELEMENT.get().defaultBlockState()), BluecenModBlocks.ENDLESS_STONE_WITH_RIFT.get().defaultBlockState())), 6));
		PLACED_FEATURE = PlacementUtils.register("bluecen:endless_stone_with_rift", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(5), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(128)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("bluecen:deleted_mod_element")));

	public EndlessStoneWithRiftFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

}
