
package net.mcreator.bluecen.world.features.ores;

public class EndlessBluecenOreFeature extends OreFeature {

	public static EndlessBluecenOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new EndlessBluecenOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("bluecen:endless_bluecen_ore", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(BluecenModBlocks.ENDLESS_STONE.get().defaultBlockState()), BluecenModBlocks.ENDLESS_BLUECEN_ORE.get().defaultBlockState())), 8));
		PLACED_FEATURE = PlacementUtils.register("bluecen:endless_bluecen_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(5), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(128)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("bluecen:deleted_mod_element")));

	public EndlessBluecenOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

}
