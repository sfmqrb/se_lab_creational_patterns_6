# توضیحات کد

## بررسی ساختار کد prototyping

* کلاس Shape یک کلاس ابسترکت است که دارای یک فیلد به نام color و یک متد () clone است. همچنین سازنده‌ای دارد که فیلد color آن را با همان مقدار آبجکت ورودی تنظیم می‌کند.
* کلاس Circle کلاس Shape را اکستند می کند و یک فیلد عمومی به نام radius دارد. سازنده آ» سازنده والد را با همان شیء فراخوانی می کند و در صورتی که شی ورودی تهی نباشد، فیلد شعاع آن را با همان مقدار شی ورودی تنظیم می کند.
* کلاس Square کلاس Shape را گسترش می دهد و یک فیلد عمومی عمومی به نام len دارد. سازنده آن مثل حالت قبل این دفعه فیلد len آن را با همان مقدار شی ورودی تنظیم می کند.
* متد clone در هر دو شی اصلی از ویژگی خاص سازنده شان استفاده کرده و با ورودی دادن خود به آن یک کپی از خودش می‌سازد. دقت شود این ناشی از نحوه پیاده سازی کانستراکتور با ورودی گرفتن یک شی از جنس خودش است.



## بررسی ساختار کد builder
* کلاس Director مسئول استفاده از اینترفیس Builder برای ساخت یک آبجکت Car است. متدی به نام constructSportsCar ارائه می‌کند که یک شی Builder را به عنوان آرگومان می‌گیرد. بعد از آن متدهایی را بر روی شی Builder فراخوانی می کند تا ویژگی های مختلف شی Car را ست کند.
* اینترفیس Builder متدهایی را که میتواند به خودرو تعلق داشته باشد را تعریف می کند. این متد ها عبارتند از reset، setSeats، setEngine، setTripComputer و setGPS.
* کلاس CarBuilder یک سازنده است که اینترفیس Builder را پیاده سازی می کند. این شامل یک شی Car است و روش هایی را برای تنظیم ویژگی های مختلف شی Car پیاده کرده است. متد getProduct شی Car ساخته شده را برمی گرداند.
* کلاس Car همان محصول در حال ساخت است. این شامل ویژگی هایی مانند seats، engine، tripComputer و gps است و ستر و گتر هایی برای تنظیم ویژگی های مختلف شی Car در آن وجود دارد.





## بررسی ساختار کد abstract factory
 * کلاس Client یک شی gc از نوع AbstractGardenCreator، یک gardenType از نوع GardenType، یک شی tree از نوع AbstractTree و یک شی flower از نوع AbstractFlower دارد.
 * کلاس Client سازنده ای دارد که پارامتر gardenType را می گیرد.
 * کلاس Client یک متد ()createGarden دارد که یک شی جدید بر اساس gardenType می‌سازد. سپس فیلدهای درخت و گل را به ترتیب به اشیایی که توسط متدهای getTree() و getFlower() شی gc برگردانده شده اند تنظیم می کند.
 * کلاس IranianGardenCreator دارای AbstractTree و AbstractFlower است.
 * کلاس IranianGardenCreator سازنده ای دارد که یک شی ChenarTree و KhatmiFlower جدید ایجاد می کند و آنها را به ترتیب به فیلدهای tree و flower اختصاص می دهد.
 * کلاس IranianGardenCreator متدهای اینترفیس AbstractGardenCreator را پیاده سازی کرده و فیلدهای tree و flower را برمی گرداند.
 * کلاس JapaneseGardenCreator مشابه کلاس IranianGardenCreator است اما به جای ChenarTree و KhatmiFlower یک J1Tree و یک G1Flower ایجاد می کند.
 * کلاس AbstractTree دارای یک فیلد tree از نوع String و متدهای getTree() و setTree() برای دریافت و تنظیم مقدار tree است.
* به شکل مشابه AbstractFlower دارای یک فیلد flower است.

# پاسخ سوالات
