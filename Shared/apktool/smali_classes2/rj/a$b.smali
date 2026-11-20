.class public Lrj/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lrj/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lrj/a;

    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object v1

    new-instance v2, Lrj/b;

    invoke-direct {v2}, Lrj/b;-><init>()V

    sget-object v3, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, v3}, Lrj/a;-><init>(Lev/c;Lrj/b;Ljava/util/concurrent/Executor;)V

    sput-object v0, Lrj/a$b;->a:Lrj/a;

    return-void
.end method

.method public static bridge synthetic a()Lrj/a;
    .locals 1

    sget-object v0, Lrj/a$b;->a:Lrj/a;

    return-object v0
.end method
