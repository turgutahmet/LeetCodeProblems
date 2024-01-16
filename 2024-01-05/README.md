
# English


## Temp Array:

> A temp integer array is created. This array stores the length of the longest increasing subsequence up to each index (i) in nums[i].


## Temp Iteration:

> Initially, the length of the longest increasing subsequence for each element is at least 1 (the element itself). Using nested loops, the length of the longest increasing subsequence is calculated for each element up to the ith index. The inner loop (j loop) checks all elements before the ith element.

> If nums[j] (jth element) is less than nums[i] (current element), then the increasing subsequence containing nums[j] can be extended with nums[i]. In this case, we compare temp[j] + 1 (current longest length + 1) with temp[i], and update temp[i] with the larger of these two values.

## Finding the Longest Length:

> A variable named maxLength is used to store the length of the longest subsequence. In each i iteration, the value of temp[i] is compared with maxLength, and maxLength is updated with the larger of these two values.

## Result:

> When the algorithm is completed, the maxLength variable contains the length of the longest increasing subsequence in the nums array, and this value is returned. Since this algorithm checks all previous elements for each element in the nums array, its time complexity is evaluated as O(n^2). Nested loops are required to find the best previous element for each element and to extend the longest subsequence.

# Turkce

## Temp Dizisi:

> temp adı verilen bir tam sayı dizisi oluşturulur. Bu dizi, her bir indekste (i), nums[i]'ye kadar olan en uzun artan alt dizinin uzunluğunu saklar.

## Temp İterasyon:

> Başlangıçta, her eleman için en uzun artan alt dizi uzunluğu en az 1'dir (eleman kendisi). İç içe iki döngü kullanılarak, i'nci indekse kadar olan her eleman için en uzun artan alt dizinin uzunluğu hesaplanır. İçteki döngü (j döngüsü), i'nci elemandan önceki tüm elemanları kontrol eder.

> Eğer nums[j] (j'nci eleman), nums[i]'den (şu anki eleman) küçükse, bu durumda nums[j]'yi içeren bir artan alt dizi, nums[i] ile uzatılabilir. Bu durumda, temp[j] + 1 (mevcut en uzun uzunluk + 1) ile temp[i]'yi karşılaştırırız ve temp[i]'yi, bu ikisinden büyük olan değer ile güncelleriz.

## En Uzun Uzunluğun Bulunması:

> maxLength adında bir değişken, en uzun alt dizinin uzunluğunu tutmak için kullanılır. Her i iterasyonunda, temp[i] değeri ile maxLength karşılaştırılır ve maxLength, bu ikisinden büyük olan değer ile güncellenir.

## Sonuç:

> Algoritma tamamlandığında, maxLength değişkeni nums dizisindeki en uzun artan alt dizinin uzunluğunu içerir ve bu değer döndürülür. Bu algoritma, verilen nums dizisindeki her eleman için önceki tüm elemanları kontrol ettiği için zaman karmaşıklığı O(n^2) olarak değerlendirilir. Her eleman için en iyi önceki elemanı bulmak ve en uzun alt diziyi uzatmak için iç içe iki döngü gereklidir. 

