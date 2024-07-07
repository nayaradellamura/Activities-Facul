SOURCES= $(shell /bin/ls *.c)
INCLUDES= ./
BINARY= consulado
CFLAGS= -ansi -pedantic -Wall -Wextra -ggdb -O3 -march=native
CC= gcc

all: clean
	rm -f $(BINARY)
	$(CC) -I$(INCLUDES) $(CFLAGS) -o $(BINARY) $(SOURCES)

clean:
	find . -name ".*.swp" -o -name "*~" -o -name ".*~" -o -name "*.out" | xargs rm -f

run: 
	./$(BINARY)
