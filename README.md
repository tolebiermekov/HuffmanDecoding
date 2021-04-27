# HuffmanDecoding
Huffman algorithm
We used a Huffman tree to decode text that was previously encoded. Our Decoding Algorithm is to read each bit from the bit string one at a time and use that bit to traverse the tree. We iterate over every bit and use a value of 0 or 1 to "walk" down the Huffman branch. After that, we can add the letter contained in this sheet to our output line. In a Huffman tree, we go from the root until we find characters, then output them and go back to the root.
