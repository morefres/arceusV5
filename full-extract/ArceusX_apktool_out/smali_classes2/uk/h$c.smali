.class public Luk/h$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luk/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Luk/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Luk/h;

    new-instance v1, Ltk/e;

    new-instance v2, Luk/d;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v3

    const/16 v4, 0xc8

    invoke-direct {v2, v3, v4}, Luk/d;-><init>(Ljava/util/concurrent/Executor;I)V

    new-instance v3, Ltk/e$a;

    invoke-direct {v3}, Ltk/e$a;-><init>()V

    invoke-direct {v1, v2, v3}, Ltk/e;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    invoke-direct {v0, v1}, Luk/h;-><init>(Ltk/c;)V

    sput-object v0, Luk/h$c;->a:Luk/h;

    return-void
.end method

.method public static bridge synthetic a()Luk/h;
    .locals 1

    sget-object v0, Luk/h$c;->a:Luk/h;

    return-object v0
.end method
