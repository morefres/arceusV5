.class public Lgm/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgm/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lgm/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgm/l;

    invoke-direct {v0}, Lgm/l;-><init>()V

    sput-object v0, Lgm/l$a;->a:Lgm/l;

    return-void
.end method

.method public static bridge synthetic a()Lgm/l;
    .locals 1

    sget-object v0, Lgm/l$a;->a:Lgm/l;

    return-object v0
.end method
