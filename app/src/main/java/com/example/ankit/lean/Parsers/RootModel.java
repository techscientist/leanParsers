import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String timezone;
	public String description;
	public CopyrightModel _copyright;
	public String logo;
	public String location_name;
	public String type;
	public String name;
	public String end_time;
	public String organizer_description;
	public String email;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public VersionModel _version;
	public String state;
	public String organizer_name;
	public String start_time;
	public String topic;
	public String privacy;

	public RootModel(CreatorModel creator, String timezone, String description, CopyrightModel copyright, String logo, String location_name, String type, String name, String end_time, String organizer_description, String email, String code_of_conduct, Call_for_papersModel call_for_papers, int id, String schedule_published_on, ArrayList<Social_linksModel> social_links, String background_image, VersionModel version, String state, String organizer_name, String start_time, String topic, String privacy) {

		this._creator = creator;
		this.timezone = timezone;
		this.description = description;
		this._copyright = copyright;
		this.logo = logo;
		this.location_name = location_name;
		this.type = type;
		this.name = name;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.background_image = background_image;
		this._version = version;
		this.state = state;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.topic = topic;
		this.privacy = privacy;

	}

}