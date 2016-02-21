class MySoundex
  def initialize
    @max_code_length = 4
    @not_a_digit = '*'
    @empty_string = ''
    @encodingsMap = {
        'b' => '1', 'f' => '1', 'p' => '1', 'v' => '1',
        'c' => '2', 'g' => '2', 'j' => '2', 'k' => '2', 'q' => '2', 's' => '2', 'x' => '2', 'z' => '2',
        'd' => '3', 't' => '3',
        'l' => '4',
        'm' => '5', 'n' => '5',
        'r' => '6'
    }
  end

  # @param [String] word
  # @return [String] the encoded word
  def encode word
    'hi'
  end

  # @param [Char] character
  # @return [Char]
  def encoded_digit(character)
    if @encodingsMap.has_key?(character)
      return @encodingsMap[character]
    end
    @not_a_digit
  end

end