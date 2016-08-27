import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String description;
	public String organizer_description;
	public String name;
	public String email;
	public String end_time;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String type;
	public int id;
	public String location_name;
	public VersionModel _version;
	public String topic;
	public String organizer_name;
	public String privacy;
	public String timezone;
	public String logo;
	public String state;

	public RootModel(CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String start_time, String code_of_conduct, Call_for_papersModel call_for_papers, String background_image, String description, String organizer_description, String name, String email, String end_time, String schedule_published_on, CreatorModel creator, String type, int id, String location_name, VersionModel version, String topic, String organizer_name, String privacy, String timezone, String logo, String state) {

		this._copyright = copyright;
		this.social_links = social_links;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.description = description;
		this.organizer_description = organizer_description;
		this.name = name;
		this.email = email;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.type = type;
		this.id = id;
		this.location_name = location_name;
		this._version = version;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.timezone = timezone;
		this.logo = logo;
		this.state = state;

	}

}