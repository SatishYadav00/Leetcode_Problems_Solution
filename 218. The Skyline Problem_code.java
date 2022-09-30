class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
      BuildingPoints[] buildingPoints = new BuildingPoints[buildings.length * 2];
        int index = 0;
        for (int[] building : buildings) {
            buildingPoints[index++] = new BuildingPoints(building[0], building[2], Position.START);
            buildingPoints[index++] = new BuildingPoints(building[1], building[2], Position.END);
        }

        Arrays.sort(buildingPoints);

        TreeMap<Integer, Integer> queue = new TreeMap<>();

        queue.put(0, 1);

        int prevMaxHeight = 0;

        List<List<Integer>> result = new ArrayList<>();

        for (BuildingPoints buildingPoint : buildingPoints) {
            if (buildingPoint.position == Position.START) {

                queue.compute(buildingPoint.h, (k, v) -> {
                    if (v != null) {
                        return v + 1;
                    }
                    return 1;
                });

            } else {
                queue.compute(buildingPoint.h, (k, v) -> {
                    if (v == 1) {
                        return null;
                    }
                    return v - 1;
                });
            }

            int currentMaxHeight = queue.lastKey();

            if (prevMaxHeight != currentMaxHeight) {
                result.add(new ArrayList<>(){{
                    add(buildingPoint.x);
                    add(currentMaxHeight);
                }});
                                
                prevMaxHeight = currentMaxHeight;
            }
        }
        return result;
    }
    
    class BuildingPoints implements Comparable<BuildingPoints> {
        int x;
        int h;
        Position position;

        BuildingPoints(int x, int h, Position position) {
            this.x = x;
            this.h = h;
            this.position = position;
        }

        @Override
        public int compareTo(BuildingPoints o) {
            if (this.x != o.x) {
                return this.x - o.x;
            }

            if (this.position == Position.START && o.position == Position.START) {
                return o.h - this.h;
            }

            if (this.position == Position.END && o.position == Position.END) {
                return this.h - o.h;
            }

            if (this.position == Position.END && o.position == Position.START) {
                return 1;
            }
            return -1;
        }
    }

    enum Position {
        START,
        END;
    }

}
