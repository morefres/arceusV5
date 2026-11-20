.class public Lom/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lom/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lom/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lom/a;

    invoke-direct {v0}, Lom/a;-><init>()V

    sput-object v0, Lom/a$a;->a:Lom/a;

    return-void
.end method

.method public static bridge synthetic a()Lom/a;
    .locals 1

    sget-object v0, Lom/a$a;->a:Lom/a;

    return-object v0
.end method
