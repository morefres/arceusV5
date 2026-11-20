.class public Lbm/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbm/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Lbm/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbm/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbm/b;-><init>(Lbm/c;)V

    sput-object v0, Lbm/b$c;->a:Lbm/b;

    return-void
.end method

.method public static bridge synthetic a()Lbm/b;
    .locals 1

    sget-object v0, Lbm/b$c;->a:Lbm/b;

    return-object v0
.end method
