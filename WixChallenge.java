public class WixChallenge {

	public static void main(String[] args) {
		System.out.println(calculateFloor("()))(())())()()(((((()((((())()()))()))()(()))(()(()((())()))))))(())))(())()))(())())))((()))((()()())()()()()())(()(()))))()()(()((())())()(()()(())(((())(())(((((()(()())())))(()((((())(())((())))()(()()(()(()))(()()(((())(())()(())()()((())()))(()()()()(((())()(((())((())((((()))()))()))))()()()((((()()))())))(()(())()))())())((((((()((())()())))))()()(())()))(()))()(()))(())((((()))(()))(())()(((()()(((())(()())()((((((()))(()())))(()()((((())((((()()()(()())()()))(((()))())((((()))))))))(((()()(()))(()(()))((((()()))()(()))(()))()(()()()()()()()(()(()))(()((((()()(()()()()))()))())))))))(())(()))(()(((()))(((())())(()(())()((()))(())(()))()))(((((())((((()()(()(((((((())(((((()())((()())())(((()((())(()(())(())))))))))((((())(()))())))()(((())()()()))()()()()()()(())))((())(())))()(())())))((())()())()))())()))()())()))()))(()((()()())((()(((()((())())))(()((((()()(()(()(())()))))(()))(()((()))((()()))((()((())(()(())((()))(((((((((()()()())(((())((((((())())()(()((((()())(())(())()((())()(()()())())(()()))()((())())((()(((()())((()(())(()())))))(())(((()())())((()(()())))())(()()()())((((((()(())(()))))))(((())((())))))()((()(())))()(((())(((()))()())))("));
		System.out.println(visits("v^^v>^<v^vv<>><vvvv<>^><v<>>v>^>v^>>^v>^v<^vv^>><>^vv><v<><^v><v<v^v<v><vv^><vvv><^<<<<<><v>v^>^v><vv<v^^<>^<^v^<^>v^>v>^v<^vvvvvv<><>>^^>v<^v^<><^^>vv^vv<<v<>^^<<v^<v>vv>^^<<^^^><v>v<<^<v<>>v^>>vv<<>>v>>>>^vvv>^^><><v<><^vv<vv<^^<<^^v<vv><<^>><v^>>^^>v>^<<v><^v><vvv><v>^<><>v>^<v^vv^vv<^v^><v^><>^v<v<>^<v>v><>^>>v><>>><<<v<<v><v^^^>><v<<<<<<<>>>v>^^v<v<^<v^><>>>>v^^<vvv><^v<^><><>>^^<^^<>v<^^<^<v<^<v^>>v>^vv^>^<>^>>>^>^^>v<v<^v<v<<v<>^<<<vv>^>v<>v<<^<>^>v<<^>^vvv>>^^^>v^^<>^^>v><>^<^v>vv<^^<vv^v^v^>vv<^<^^v<<>^<^v><<>^<><v<<^v<<<><<<>^^<v<>v<v^<><v>vv<v^>^v>v>>v<v^<v<<>^<><v^<<v>^v<><>>v^<<^v<<<<>^vv^vv><>>^v>vvv><>v><>>v^<<^^^^v<>>><<<^^^<>>>vvv<^vv<<><^>^><>v<>vv<<v<<vv^v><>^vvv>>^vv^><<<vv<v^>>^>>v>^>v^v>>^>v>^<^^v>v<<<^<^>>v^>>^vvvv<vv>><>v>v<v^<^v>vvv^v<>vv>^<<>v<<<<^v<v^><^>><><^<^>>><v<v^><v<v<><v>>>v>>vvv^<<^<v>v^<<^v^vv^^<>^v^><>^>^v<vvvv>>>><v^<>><<^^^<^v>vv<>>v^v^v>^v<v>^^v>^<^>^^vvv^<^<v<^v><>vv>>>^v><v>v^><<^v^><^^>^>v><><><>>>>>^>v>><<<<^<^>>v>^v<<^<><>^<v^<<<<v<^^^<^^^<<>^^v>>v<><>v<^v^^v^<v>vv<>><^vvvv>^v<>v>>^vv^^>>v>v<^>>^v><^<<>>v^vv>^<^v<<^v<<>^v>><^<^<<^>^^<^>v<<><v>v>^<v^v><><v><<^<>>>v<v^<<<^>v^v>v>^>^<<vv>^^>v^^v>v><><^>>>v<vv<^>v<^^^><^vv^>>v<<>v^><<>v^<<<vv^><<<^>><<v^<^>^vv<>>>>v>^^vv>>><^<v>v<^<><<v<^^vv<v<<^<v><<<<vv>v>>vvv>v>>^>^>v^>^^<>v<^>^^<<<v^^<^<^v<v^>>vvv^^^v<>v<v>^>>^^<<^>vv><v><<<<<>^^v><^>>^<^^^^><v>v<>^v<v><^^v<<><^v>>^^v^^v<v<<<^><><v<<^>v<v^^vv<^^>^vv>><^<<^vv<<>>>^<>v>>^>v^v><^v<^<>^<^v>><v<><^>v<v^<<>v^v<>^v<^^>v^v>v>^vv^>^^v>^^>>v><^v<^>>vv^<^v><>^>^<v<><^>v<<v^v<<<<^v^^<^^vv>v<v<>>v<<v^^>>>^><v^^><v<v^vv>>^vv<>v^><v<><vvv>>^^<<><^>>v<>>^><<>^^v<v<><^<><^v<<^vvv^^vv<v>>>>>vvvv^>v>^^vv>>^^<v<^>^vv^v>^vvvvv<^<>>><<<v^v^v<<v><v<>>>^>>"));
	}
	
	public static int calculateFloor(String pattern) {
		int level = 0;
		char[] chars = pattern.toCharArray();
		for(int i = 0 ; i < chars.length ; i++) {
			if(chars[i] == '(') {
				level++;
			}else {
				level--;
			}
		}
		return level;
	}
	public static int visits(String pattern) {
		int[][] field = new int[1000][1000];
		for(int i=0 ; i < 1000 ; i++)
			for(int j=0 ; j < 1000 ; j++)
				field[i][j] = 0;
		int row = 499, col=499;
		field[row][col] = 1;
		int visit = 0;
		char[] chars = pattern.toCharArray();
		for(int i= 0; i < chars.length ; i++) {
			switch (chars[i]) {
			case 'v':
				col--;
				field[row][col]++;
				break;
			case '^':
				col++;
				field[row][col]++;
				break;
			case '>':
				row++;
				field[row][col]++;
				break;
			case '<':
				row--;
				field[row][col]++;
				break;
			default:
				break;
			}
		}
		for(int i=0 ; i < 1000 ; i++)
			for(int j=0 ; j < 1000 ; j++)
				if(field[i][j] > 1)
					visit++;
		return visit;
	}

}
