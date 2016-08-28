import java.util.ArrayList;

class RootModel {

	public String name;
	public String organizer_description;
	public String logo;
	public String state;
	public String type;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String location_name;
	public VersionModel _version;
	public String end_time;
	public String privacy;
	public String description;
	public CopyrightModel _copyright;
	public String timezone;
	public String email;
	public int id;
	public String code_of_conduct;
	public String start_time;
	public String topic;
	public String schedule_published_on;

	public RootModel(String name, String organizer_description, String logo, String state, String type, String background_image, ArrayList<Social_linksModel> social_links, String organizer_name, Call_for_papersModel call_for_papers, CreatorModel creator, String location_name, VersionModel version, String end_time, String privacy, String description, CopyrightModel copyright, String timezone, String email, int id, String code_of_conduct, String start_time, String topic, String schedule_published_on) {

		this.name = name;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.state = state;
		this.type = type;
		this.background_image = background_image;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.location_name = location_name;
		this._version = version;
		this.end_time = end_time;
		this.privacy = privacy;
		this.description = description;
		this._copyright = copyright;
		this.timezone = timezone;
		this.email = email;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;

	}

}