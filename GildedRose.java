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
                            exOne(item);
                        }

                        if (item.sellIn < 6)
                        {
                           exOne(item);
                        }
                    }
                }
            } else
            {
                if (item.quality > 0)
                {
                    exTwo(item);
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
                    exOne(item);
                } else
                {
                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
                    {
                        item.quality = 0;
                    } else
                    {
                        if (item.quality > 0)
                        {
                            exTwo(item);
                        }
                    }
                }
            }
        }
    }
    private static void exTwo(Item item)
    {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros"))
        {
            item.quality--;
        }
    }
    private static void exOne(Item item)
    {
        if (item.quality < 50)
        {
            item.quality++;
        }
    }
}
