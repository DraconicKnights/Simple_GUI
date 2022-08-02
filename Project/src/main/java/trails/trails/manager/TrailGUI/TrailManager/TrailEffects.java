package trails.trails.manager.TrailGUI.TrailManager;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import trails.trails.Trails;

public class TrailEffects {

    private int taskID;
    private final Player player;

    public TrailEffects(Player player) {
        this.player = player;
    }

    public void startFire() {
        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Trails.getPlugin(Trails.class), new Runnable() {

            double var = 0;
            Location location, first, second, third, fourth;
            ParticleManager particleManager = new ParticleManager(player.getUniqueId());

            @Override
            public void run() {
                if (!particleManager.hasID()) {
                    particleManager.setID(taskID);
                }

                var += Math.PI / 16;

                location = player.getLocation();
                first = location.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
                second = location.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
                third = location.clone().add( Math.sin(var + Math.PI), Math.cos(var) + 1, Math.sin(var));
                fourth = location.clone().add(Math.cos(var), Math.cos(var) + 1, Math.sin(var + Math.PI));

                player.getWorld().spawnParticle(Particle.FLAME, first, 0);
                player.getWorld().spawnParticle(Particle.CAMPFIRE_COSY_SMOKE, second, 0);
                player.getWorld().spawnParticle(Particle.FLAME, third, 0);
                player.getWorld().spawnParticle(Particle.CAMPFIRE_SIGNAL_SMOKE, fourth, 0);
            }
        }, 0, 1);

    }

    public void startWater() {
        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Trails.getPlugin(Trails.class), new Runnable() {

            double var = 0;
            Location location, first, second, third, fourth;
            ParticleManager particleManager = new ParticleManager(player.getUniqueId());

            @Override
            public void run() {
                if (!particleManager.hasID()) {
                    particleManager.setID(taskID);
                }

                var += Math.PI / 16;

                location = player.getLocation();
                first = location.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
                second = location.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
                third = location.clone().add( Math.sin(var + Math.PI), Math.cos(var) + 1, Math.sin(var));
                fourth = location.clone().add(Math.cos(var), Math.cos(var) + 1, Math.sin(var + Math.PI));

                player.getWorld().spawnParticle(Particle.WATER_DROP, first, 0);
                player.getWorld().spawnParticle(Particle.WATER_DROP, second, 0);
                player.getWorld().spawnParticle(Particle.WATER_BUBBLE, third, 0);
                player.getWorld().spawnParticle(Particle.WATER_BUBBLE, fourth, 0);

            }
        }, 0, 1);

    }

    public void startLava() {
        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Trails.getPlugin(Trails.class), new Runnable() {

            double var = 0;
            Location location, first, second, third, fourth;
            ParticleManager particleManager = new ParticleManager(player.getUniqueId());

            @Override
            public void run() {
                if (!particleManager.hasID()) {
                    particleManager.setID(taskID);
                }

                var += Math.PI / 16;

                location = player.getLocation();
                first = location.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
                second = location.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
                third = location.clone().add( Math.sin(var + Math.PI), Math.cos(var) + 1, Math.sin(var));
                fourth = location.clone().add(Math.cos(var), Math.cos(var) + 1, Math.sin(var + Math.PI));

                player.getWorld().spawnParticle(Particle.DRIP_LAVA, first, 0);
                player.getWorld().spawnParticle(Particle.SMALL_FLAME, second, 0);
                player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, third, 0);
                player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, fourth, 0);

            }
        }, 0, 1);

    }

    public void startSnow() {
        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Trails.getPlugin(Trails.class), new Runnable() {

            double var = 0;
            Location location, first, second, third, fourth;
            ParticleManager particleManager = new ParticleManager(player.getUniqueId());

            @Override
            public void run() {
                if (!particleManager.hasID()) {
                    particleManager.setID(taskID);
                }

                var += Math.PI / 16;

                location = player.getLocation();
                first = location.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
                second = location.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
                third = location.clone().add( Math.sin(var + Math.PI), Math.cos(var) + 1, Math.sin(var));
                fourth = location.clone().add(Math.cos(var), Math.cos(var) + 1, Math.sin(var + Math.PI));

                player.getWorld().spawnParticle(Particle.SNOWFLAKE, first, 0);
                player.getWorld().spawnParticle(Particle.SNOWFLAKE, second, 0);
                player.getWorld().spawnParticle(Particle.SNOW_SHOVEL, third, 0);
                player.getWorld().spawnParticle(Particle.SNOW_SHOVEL, fourth, 0);

            }
        }, 0, 1);

    }

    public void startNature() {
        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Trails.getPlugin(Trails.class), new Runnable() {

            double var = 0;
            Location location, first, second, third, fourth;
            ParticleManager particleManager = new ParticleManager(player.getUniqueId());

            @Override
            public void run() {
                if (!particleManager.hasID()) {
                    particleManager.setID(taskID);
                }

                var += Math.PI / 16;

                location = player.getLocation();
                first = location.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
                second = location.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
                third = location.clone().add( Math.sin(var + Math.PI), Math.cos(var) + 1, Math.sin(var));
                fourth = location.clone().add(Math.cos(var), Math.cos(var) + 1, Math.sin(var + Math.PI));

                player.getWorld().spawnParticle(Particle.DOLPHIN, first, 0);
                player.getWorld().spawnParticle(Particle.DRIPPING_HONEY, second, 0);
                player.getWorld().spawnParticle(Particle.DOLPHIN, third, 0);
                player.getWorld().spawnParticle(Particle.DRIPPING_HONEY, fourth, 0);

            }
        }, 0, 1);

    }

    public void startMagic() {
        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Trails.getPlugin(Trails.class), new Runnable() {

            double var = 0;
            Location location, first, second, third, fourth;
            ParticleManager particleManager = new ParticleManager(player.getUniqueId());

            @Override
            public void run() {
                if (!particleManager.hasID()) {
                    particleManager.setID(taskID);
                }

                var += Math.PI / 16;

                location = player.getLocation();
                first = location.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
                second = location.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
                third = location.clone().add( Math.sin(var + Math.PI), Math.cos(var) + 1, Math.sin(var));
                fourth = location.clone().add(Math.cos(var), Math.cos(var) + 1, Math.sin(var + Math.PI));

                player.getWorld().spawnParticle(Particle.ENCHANTMENT_TABLE, first, 0);
                player.getWorld().spawnParticle(Particle.TOTEM, second, 0);
                player.getWorld().spawnParticle(Particle.ENCHANTMENT_TABLE, third, 0);
                player.getWorld().spawnParticle(Particle.TOTEM, fourth, 0);

            }
        }, 0, 1);

    }

    public void startDragon() {
        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Trails.getPlugin(Trails.class), new Runnable() {

            double var = 0;
            Location location, first, second, third, fourth;
            ParticleManager particleManager = new ParticleManager(player.getUniqueId());

            @Override
            public void run() {
                if (!particleManager.hasID()) {
                    particleManager.setID(taskID);
                }

                var += Math.PI / 16;

                location = player.getLocation();
                first = location.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
                second = location.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
                third = location.clone().add( Math.sin(var + Math.PI), Math.cos(var) + 1, Math.sin(var));
                fourth = location.clone().add(Math.cos(var), Math.cos(var) + 1, Math.sin(var + Math.PI));

                player.getWorld().spawnParticle(Particle.DRAGON_BREATH, first, 0);
                player.getWorld().spawnParticle(Particle.END_ROD, second, 0);
                player.getWorld().spawnParticle(Particle.DRAGON_BREATH, third, 0);
                player.getWorld().spawnParticle(Particle.END_ROD, fourth, 0);

            }
        }, 0, 1);

    }

    // Free Section and core functions

    public void startNormal() {
        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Trails.getPlugin(Trails.class), new Runnable() {

            double var = 0;
            Location location, first, second, third, fourth;
            ParticleManager particleManager = new ParticleManager(player.getUniqueId());

            @Override
            public void run() {
                if (!particleManager.hasID()) {
                    particleManager.setID(taskID);
                }

                var += Math.PI / 16;

                location = player.getLocation();
                first = location.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
                second = location.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
                third = location.clone().add( Math.sin(var + Math.PI), Math.cos(var) + 1, Math.sin(var));
                fourth = location.clone().add(Math.cos(var), Math.cos(var) + 1, Math.sin(var + Math.PI));

                player.getWorld().spawnParticle(Particle.VILLAGER_ANGRY, first, 0);
                player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, second, 0);
                player.getWorld().spawnParticle(Particle.VILLAGER_ANGRY, third, 0);
                player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, fourth, 0);

            }
        }, 0, 1);

    }

    public void startDeep() {
        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Trails.getPlugin(Trails.class), new Runnable() {

            double var = 0;
            Location location, first, second, third, fourth;
            ParticleManager particleManager = new ParticleManager(player.getUniqueId());

            @Override
            public void run() {
                if (!particleManager.hasID()) {
                    particleManager.setID(taskID);
                }

                var += Math.PI / 16;

                location = player.getLocation();
                first = location.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
                second = location.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
                third = location.clone().add( Math.sin(var + Math.PI), Math.cos(var) + 1, Math.sin(var));
                fourth = location.clone().add(Math.cos(var), Math.cos(var) + 1, Math.sin(var + Math.PI));

                player.getWorld().spawnParticle(Particle.BUBBLE_POP, first, 0);
                player.getWorld().spawnParticle(Particle.WATER_BUBBLE, second, 0);
                player.getWorld().spawnParticle(Particle.BUBBLE_POP, third, 0);
                player.getWorld().spawnParticle(Particle.WATER_BUBBLE, fourth, 0);

            }
        }, 0, 1);

    }


    public void startClear() {
        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Trails.getPlugin(Trails.class), new Runnable() {

            double var = 0;
            Location location, first, second, third, fourth;
            ParticleManager particleManager = new ParticleManager(player.getUniqueId());

            @Override
            public void run() {
                if (!particleManager.hasID()) {
                    particleManager.setID(taskID);
                }

                var += Math.PI / 16;

                location = player.getLocation();
                first = location.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
                second = location.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
                third = location.clone().add( Math.sin(var + Math.PI), Math.cos(var) + 1, Math.sin(var));
                fourth = location.clone().add(Math.cos(var), Math.cos(var) + 1, Math.sin(var + Math.PI));

            }
        }, 0, 1);

    }

}
