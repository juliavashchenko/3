package com.gildedrose;

public class BackstagePass extends Item
{
    public BackstagePass(int sellIn, int quality)
    {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }
    @Override
    public void update_quality()
    {
        increase();
        if (sellIn < 11)
        {
            increase();
        }
        if (sellIn < 6)
        {
            increase();
        }
        sellIn--;
        if (sellIn < 0)
        {
            quality = 0;
        }
    }
}