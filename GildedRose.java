package com.gildedrose;
class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items)
        {
            if (item.name.equals("Aged Brie") || item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
            {
                if (item.quality < 50)
                {
                    item.quality++;

                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
                    {
                        if (item.sellIn < 11)
                        {
                            item.increaseQality();
                        }

                        if (item.sellIn < 6)
                        {
                            item.increaseQality();
                        }
                    }
                }
            } else
            {
                if (item.quality > 0)
                {
                    item.decreaseQuality();
                }
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros"))
            {
                item.sellIn--;
            }

            if (item.sellIn < 0)
            {
                if (item.name.equals("Aged Brie"))
                {
                    item.increaseQality();
                } else
                {
                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
                    {
                        item.quality = 0;
                    } else
                    {
                        if (item.quality > 0)
                        {
                            item.decreaseQuality();
                        }
                    }
                }
            }
        }
    }

}