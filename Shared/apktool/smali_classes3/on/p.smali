.class public Lon/p;
.super Lon/a;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lon/a;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lon/a;-><init>()V

    .line 3
    iput-object p1, p0, Lon/p;->g:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lon/p;->h:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lon/p;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lon/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Lon/d0;->c(Lon/p;)V

    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lon/p;->h:Ljava/lang/String;

    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lon/p;->g:Ljava/lang/String;

    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lon/p;->i:Ljava/lang/String;

    return-object v0
.end method
