.class public Lel/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lel/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lel/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lel/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lel/a;-><init>(Lel/b;)V

    sput-object v0, Lel/a$b;->a:Lel/a;

    return-void
.end method

.method public static bridge synthetic a()Lel/a;
    .locals 1

    sget-object v0, Lel/a$b;->a:Lel/a;

    return-object v0
.end method
