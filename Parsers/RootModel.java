import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String start_time;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public VersionModel _version;
	public String email;
	public String description;
	public String organizer_name;
	public String end_time;
	public String timezone;
	public String type;
	public String name;
	public String logo;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String background_image;
	public String code_of_conduct;
	public String organizer_description;
	public String schedule_published_on;
	public String privacy;

	public RootModel(CopyrightModel copyright, CreatorModel creator, String start_time, String topic, ArrayList<Social_linksModel> social_links, String location_name, VersionModel version, String email, String description, String organizer_name, String end_time, String timezone, String type, String name, String logo, int id, Call_for_papersModel call_for_papers, String state, String background_image, String code_of_conduct, String organizer_description, String schedule_published_on, String privacy) {

		this._copyright = copyright;
		this._creator = creator;
		this.start_time = start_time;
		this.topic = topic;
		this.social_links = social_links;
		this.location_name = location_name;
		this._version = version;
		this.email = email;
		this.description = description;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.timezone = timezone;
		this.type = type;
		this.name = name;
		this.logo = logo;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;

	}

}